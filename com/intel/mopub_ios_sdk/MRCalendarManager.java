package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.eventkit.EKCalendar;
import ios.eventkitui.EKEventEditViewController;
import ios.eventkitui.protocol.EKEventEditViewDelegate;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRCalendarManager extends NSObject implements
		EKEventEditViewDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MRCalendarManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRCalendarManager alloc();

	@Generated
	@Selector("createCalendarEventWithParameters:")
	public native void createCalendarEventWithParameters(NSDictionary parameters);

	@Generated
	@Selector("delegate")
	public native NSObject delegate();

	@Generated
	@Selector("eventEditViewController:didCompleteWithAction:")
	public native void eventEditViewControllerDidCompleteWithAction(
			EKEventEditViewController controller, long var2);

	@Generated
	@IsOptional
	@Selector("eventEditViewControllerDefaultCalendarForNewEvents:")
	public native EKCalendar eventEditViewControllerDefaultCalendarForNewEvents(
			EKEventEditViewController controller);

	@Generated
	@Selector("init")
	public native MRCalendarManager init();

	@Generated
	@Selector("initWithDelegate:")
	public native MRCalendarManager initWithDelegate(NSObject delegate);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(NSObject value);

	@Generated
	public void setDelegate(NSObject value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}
}