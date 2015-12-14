package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MOPUBPlayerViewControllerDelegate;
import ios.avfoundation.AVPlayerItem;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSURL;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBPlayerViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBPlayerViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBPlayerViewController alloc();

	@Generated
	@Selector("avPlayer")
	public native MOPUBAVPlayer avPlayer();

	@Generated
	@Selector("defaultActionURL")
	public native NSURL defaultActionURL();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MOPUBPlayerViewControllerDelegate delegate();

	@Generated
	@Selector("displayMode")
	@NUInt
	public native long displayMode();

	@Generated
	@Selector("dispose")
	public native void dispose();

	@Generated
	@Selector("disposed")
	public native boolean disposed();

	@Generated
	@Selector("init")
	public native MOPUBPlayerViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBPlayerViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MOPUBPlayerViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithVideoConfig:nativeVideoAdConfig:logEventProperties:")
	public native MOPUBPlayerViewController initWithVideoConfigNativeVideoAdConfigLogEventProperties(
			MPVideoConfig videoConfig,
			MOPUBNativeVideoAdConfigValues nativeVideoAdConfig,
			MPAdConfigurationLogEventProperties logEventProperties);

	@Generated
	@Selector("isReadyToPlay")
	public native boolean isReadyToPlay();

	@Generated
	@Selector("loadAndPlayVideo")
	public native void loadAndPlayVideo();

	@Generated
	@Selector("mediaURL")
	public native NSURL mediaURL();

	@Generated
	@Selector("muted")
	public native boolean muted();

	@Generated
	@Selector("nativeVideoAdConfig")
	public native MOPUBNativeVideoAdConfigValues nativeVideoAdConfig();

	@Generated
	@Selector("pause")
	public native void pause();

	@Generated
	@Selector("paused")
	public native boolean paused();

	@Generated
	@Selector("playerItem")
	public native AVPlayerItem playerItem();

	@Generated
	@Selector("playerView")
	public native MOPUBPlayerView playerView();

	@Generated
	@Selector("playing")
	public native boolean playing();

	@Generated
	@Selector("resume")
	public native void resume();

	@Generated
	@Selector("seekToTime:")
	public native void seekToTime(double time);

	@Generated
	@Selector("setDefaultActionURL:")
	public native void setDefaultActionURL(NSURL value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MOPUBPlayerViewControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MOPUBPlayerViewControllerDelegate value) {
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

	@Generated
	@Selector("setDisplayMode:")
	public native void setDisplayMode(@NUInt long value);

	@Generated
	@Selector("setDisposed:")
	public native void setDisposed(boolean value);

	@Generated
	@Selector("setIsReadyToPlay:")
	public native void setIsReadyToPlay(boolean value);

	@Generated
	@Selector("setMuted:")
	public native void setMuted(boolean value);

	@Generated
	@Selector("setPaused:")
	public native void setPaused(boolean value);

	@Generated
	@Selector("setPlaying:")
	public native void setPlaying(boolean value);

	@Generated
	@Selector("setStartedLoading:")
	public native void setStartedLoading(boolean value);

	@Generated
	@Selector("setVastTracking:")
	public native void setVastTracking(MPVASTTracking value);

	@Generated
	@Selector("shouldPausePlayer")
	public native boolean shouldPausePlayer();

	@Generated
	@Selector("shouldResumePlayer")
	public native boolean shouldResumePlayer();

	@Generated
	@Selector("shouldStartNewPlayer")
	public native boolean shouldStartNewPlayer();

	@Generated
	@Selector("startedLoading")
	public native boolean startedLoading();

	@Generated
	@Selector("vastTracking")
	public native MPVASTTracking vastTracking();

	@Generated
	@Selector("videoAspectRatio")
	@NFloat
	public native double videoAspectRatio();

	@Generated
	@Selector("willEnterFullscreen")
	public native void willEnterFullscreen();

	@Generated
	@Selector("willExitFullscreen")
	public native void willExitFullscreen();
}