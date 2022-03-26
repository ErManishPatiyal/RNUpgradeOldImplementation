import React, { Component } from "react";
import {
	AppRegistry,
} from "react-native";
import Test from "./Test";

import { Navigation } from "react-native-navigation";
/* This is the only component in our application as we will only be doing business logic in RN **/
export default class AuditCheckNew extends Component {


	render() {
		console.log("Testing")
		return (<Test />
			//<Text>Hello world</Text>
			// <Provider store={store}>
			// 	<View>
			// 		<GFKParser />
			// 	</View>
			// </Provider>
		);
	}
}

AppRegistry.registerComponent("AuditCheckNew", () => AuditCheckNew);
// Navigation.registerComponent('AuditCheckNew', () => AuditCheckNew);

// Navigation.events().registerAppLaunchedListener(() => {
// 	Navigation.setRoot({
// 		root: {

// 			component: {
// 				name: 'AuditCheckNew'
// 			}
// 		}

// 	});
// });