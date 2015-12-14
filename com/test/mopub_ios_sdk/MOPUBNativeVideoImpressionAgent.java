package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBNativeVideoImpressionAgent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBNativeVideoImpressionAgent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBNativeVideoImpressionAgent alloc();

	@Generated
	@Selector("init")
	public native MOPUBNativeVideoImpressionAgent init();

	@Generated
	@Selector("initWithVideoView:requiredVisibilityPercentage:requiredPlaybackDuration:")
	public native MOPUBNativeVideoImpressionAgent initWithVideoViewRequiredVisibilityPercentageRequiredPlaybackDuration(
			UIView videoView, @NFloat double visiblePercentage,
			double playbackDuration);

	@Generated
	@Selector("shouldTrackImpressionWithCurrentPlaybackTime:")
	public native boolean shouldTrackImpressionWithCurrentPlaybackTime(
			double currentPlaybackTime);
}