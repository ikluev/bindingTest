package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRCreateCalendarEventCommand extends MRCommand {
	static {
		NatJ.register();
	}

	@Generated
	protected MRCreateCalendarEventCommand(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRCreateCalendarEventCommand alloc();

	@Generated
	@Selector("commandForString:")
	public static native MRCreateCalendarEventCommand commandForString(
			String string);

	@Generated
	@Selector("init")
	public native MRCreateCalendarEventCommand init();
}