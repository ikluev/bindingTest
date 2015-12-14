package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MOPUBPlayerViewDelegate;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIControl;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBPlayerView extends UIControl {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBPlayerView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBPlayerView alloc();

	@Generated
	@Selector("avPlayer")
	public native MOPUBAVPlayer avPlayer();

	@Generated
	@Selector("createPlayerView")
	public native void createPlayerView();

	@Generated
	@Selector("displayMode")
	@NUInt
	public native long displayMode();

	@Generated
	@Selector("handleVideoInitFailure")
	public native void handleVideoInitFailure();

	@Generated
	@Selector("init")
	public native MOPUBPlayerView init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBPlayerView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MOPUBPlayerView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("initWithFrame:delegate:")
	public native MOPUBPlayerView initWithFrameDelegate(@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) MOPUBPlayerViewDelegate delegate);

	@Generated
	@Selector("playbackDidFinish")
	public native void playbackDidFinish();

	@Generated
	@Selector("playbackTimeDidProgress")
	public native void playbackTimeDidProgress();

	@Generated
	@Selector("setAvPlayer:")
	public native void setAvPlayer(MOPUBAVPlayer value);

	@Generated
	@Selector("setDisplayMode:")
	public native void setDisplayMode(@NUInt long value);

	@Generated
	@Selector("setProgressBarVisible:")
	public native void setProgressBarVisible(boolean visible);

	@Generated
	@Selector("setVideoGravity:")
	public native void setVideoGravity(String value);

	@Generated
	@Selector("videoGravity")
	public native String videoGravity();
}