package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPTableViewCellImpressionTrackerDelegate;
import ios.NSObject;
import ios.uikit.UITableView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPTableViewCellImpressionTracker extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPTableViewCellImpressionTracker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPTableViewCellImpressionTracker alloc();

	@Generated
	@Selector("init")
	public native MPTableViewCellImpressionTracker init();

	@Generated
	@Selector("initWithTableView:delegate:")
	public native MPTableViewCellImpressionTracker initWithTableViewDelegate(
			UITableView tableView,
			@Mapped(ObjCObjectMapper.class) MPTableViewCellImpressionTrackerDelegate delegate);

	@Generated
	@Selector("startTracking")
	public native void startTracking();

	@Generated
	@Selector("stopTracking")
	public native void stopTracking();
}