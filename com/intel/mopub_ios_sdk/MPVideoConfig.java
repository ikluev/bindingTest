package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVideoConfig extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVideoConfig(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptInvitationLinearTrackers")
	public native NSArray acceptInvitationLinearTrackers();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVideoConfig alloc();

	@Generated
	@Selector("clickThroughURL")
	public native NSURL clickThroughURL();

	@Generated
	@Selector("clickTrackingURLs")
	public native NSArray clickTrackingURLs();

	@Generated
	@Selector("closeLinearTrackers")
	public native NSArray closeLinearTrackers();

	@Generated
	@Selector("collapseTrackers")
	public native NSArray collapseTrackers();

	@Generated
	@Selector("completionTrackers")
	public native NSArray completionTrackers();

	@Generated
	@Selector("creativeViewTrackers")
	public native NSArray creativeViewTrackers();

	@Generated
	@Selector("errorURLs")
	public native NSArray errorURLs();

	@Generated
	@Selector("exitFullscreenTrackers")
	public native NSArray exitFullscreenTrackers();

	@Generated
	@Selector("expandTrackers")
	public native NSArray expandTrackers();

	@Generated
	@Selector("firstQuartileTrackers")
	public native NSArray firstQuartileTrackers();

	@Generated
	@Selector("fullscreenTrackers")
	public native NSArray fullscreenTrackers();

	@Generated
	@Selector("impressionURLs")
	public native NSArray impressionURLs();

	@Generated
	@Selector("init")
	public native MPVideoConfig init();

	@Generated
	@Selector("initWithVASTResponse:")
	public native MPVideoConfig initWithVASTResponse(MPVASTResponse response);

	@Generated
	@Selector("mediaURL")
	public native NSURL mediaURL();

	@Generated
	@Selector("midpointTrackers")
	public native NSArray midpointTrackers();

	@Generated
	@Selector("minimumFractionOfVideoVisible")
	public native double minimumFractionOfVideoVisible();

	@Generated
	@Selector("minimumViewabilityTimeInterval")
	public native double minimumViewabilityTimeInterval();

	@Generated
	@Selector("muteTrackers")
	public native NSArray muteTrackers();

	@Generated
	@Selector("otherProgressTrackers")
	public native NSArray otherProgressTrackers();

	@Generated
	@Selector("pauseTrackers")
	public native NSArray pauseTrackers();

	@Generated
	@Selector("resumeTrackers")
	public native NSArray resumeTrackers();

	@Generated
	@Selector("rewindTrackers")
	public native NSArray rewindTrackers();

	@Generated
	@Selector("skipTrackers")
	public native NSArray skipTrackers();

	@Generated
	@Selector("startTrackers")
	public native NSArray startTrackers();

	@Generated
	@Selector("thirdQuartileTrackers")
	public native NSArray thirdQuartileTrackers();

	@Generated
	@Selector("unmuteTrackers")
	public native NSArray unmuteTrackers();

	@Generated
	@Selector("viewabilityTrackingURL")
	public native NSURL viewabilityTrackingURL();
}