package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.eventkit.EKCalendar;
import ios.eventkitui.EKEventEditViewController;
import ios.eventkitui.protocol.EKEventEditViewDelegate;
import ios.storekit.SKStoreProductViewController;
import ios.storekit.protocol.SKStoreProductViewControllerDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPLastResortDelegate extends NSObject implements
		SKStoreProductViewControllerDelegate, EKEventEditViewDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPLastResortDelegate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPLastResortDelegate alloc();

	@Generated
	@Selector("eventEditViewController:didCompleteWithAction:")
	public native void eventEditViewControllerDidCompleteWithAction(
			EKEventEditViewController controller, long action);

	@Generated
	@IsOptional
	@Selector("eventEditViewControllerDefaultCalendarForNewEvents:")
	public native EKCalendar eventEditViewControllerDefaultCalendarForNewEvents(
			EKEventEditViewController controller);

	@Generated
	@Selector("init")
	public native MPLastResortDelegate init();

	@Generated
	@IsOptional
	@Selector("productViewControllerDidFinish:")
	public native void productViewControllerDidFinish(
			SKStoreProductViewController viewController);

	@Generated
	@Selector("sharedDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedDelegate();
}