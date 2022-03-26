import React, { Component } from "react";
import {
	AppRegistry, Text, View, Platform,
	DeviceEventEmitter,
	NativeEventEmitter,
	NativeModules,
} from "react-native";


/* This is the only component in our application as we will only be doing business logic in RN **/
class Test extends Component {
	constructor(props) {
		super(props);
		this.handleNativeEvents();
		console.log("Helloworld 1")
	}

	handleNativeEvents() {
		const eventEmitter =
			Platform.OS === 'ios'
				? new NativeEventEmitter(NativeModules.Questions)
				: DeviceEventEmitter;

		eventEmitter.addListener('NowIdle', () => {
			console.log("Now IDLE HERE");
		});
	}


	render() {
		console.log("Helloworld")
		return null;
		// <Provider store={store}>
		// 	<View>
		// 		<GFKParser />
		// 	</View>
		// </Provider>

	}
}

export default Test