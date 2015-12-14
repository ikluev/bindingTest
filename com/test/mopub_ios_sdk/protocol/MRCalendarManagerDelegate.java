package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MRCalendarManager;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRCalendarManagerDelegate")
public interface MRCalendarManagerDelegate {
	@Generated
	@Selector("calendarManager:didFailToCreateCalendarEventWithErrorMessage:")
	void calendarManagerDidFailToCreateCalendarEventWithErrorMessage(
			MRCalendarManager manager, String message);

	@Generated
	@Selector("calendarManagerDidDismissCalendarEditor:")
	void calendarManagerDidDismissCalendarEditor(MRCalendarManager manager);

	@Generated
	@Selector("calendarManagerWillPresentCalendarEditor:")
	void calendarManagerWillPresentCalendarEditor(MRCalendarManager manager);

	@Generated
	@Selector("viewControllerForPresentingCalendarEditor")
	UIViewController viewControllerForPresentingCalendarEditor();
}