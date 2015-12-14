package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
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
public class MPVASTTracking extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTTracking(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTTracking alloc();

	@Generated
	@Selector("handleNewVideoView:")
	public native void handleNewVideoView(UIView videoView);

	@Generated
	@Selector("handleVideoEvent:videoTimeOffset:")
	public native void handleVideoEventVideoTimeOffset(
			@NUInt long videoEventType, double timeOffset);

	@Generated
	@Selector("init")
	public native MPVASTTracking init();

	@Generated
	@Selector("initWithMPVideoConfig:videoView:")
	public native MPVASTTracking initWithMPVideoConfigVideoView(
			MPVideoConfig videoConfig, UIView videoView);

	@Generated
	@Selector("setVideoDuration:")
	public native void setVideoDuration(double value);

	@Generated
	@Selector("videoConfig")
	public native MPVideoConfig videoConfig();

	@Generated
	@Selector("videoDuration")
	public native double videoDuration();
}