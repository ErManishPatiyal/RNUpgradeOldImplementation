import React, { Component } from "react";
import { AppRegistry, View } from "react-native";
import { Provider } from "react-redux";
import { applyMiddleware, createStore } from "redux";
import thunk from "redux-thunk";
import { setJSExceptionHandler } from "react-native-exception-handler";
import asyncCatch from "redux-async-catch";
import { fetchError, setMessageAndVariables, setTargetTagsToLogs, handleDialogFileLogs } from "./App/lib/helpers";
import reducer from "./App/reducers";
import GFKParser from "./App/index";
import Questions from "./Questions";

export const store = createStore(reducer, applyMiddleware(asyncCatch(fetchError), thunk));

setJSExceptionHandler(async (e, isFatal) => {
	showLog('DEBUG Logs V1:' + DebugFile);
	if (isFatal) {
		showLog(`Error Message :${e.message}`);
		showLog(`Error Name :${e.name}`);

		// If redux object is present then get the current Question name
		// and send it via native method in a alert dialog*/
		const { message, variables } = setMessageAndVariables(store, e.message); // Add variables to logs at the end MSJ-158
		const targetTags = setTargetTagsToLogs(store); //Add target tags at the end of debug logs MSJ-158

		DebugFile = DebugFile.split("\n").slice(-2000).join("\n");
		const dialogData = await handleDialogFileLogs();
		DebugFile += `\n DialogFile: ${JSON.stringify(dialogData, null, 2)}`;

		showLog('DEBUG Logs V1:' + DebugFile);

		Questions.onErrorOccured(e.name, message, DebugFile, (targetTags + variables));
	}
}, true);

export default class ConsumerScan extends Component {
	render() {
		return (
			<Provider store={store}>
				<View>
					<GFKParser />
				</View>
			</Provider>
		);
	}
}

AppRegistry.registerComponent("ConsumerScan", () => ConsumerScan);
