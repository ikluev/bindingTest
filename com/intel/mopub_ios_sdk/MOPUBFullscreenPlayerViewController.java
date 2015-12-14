package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MOPUBFullscreenPlayerViewControllerDelegate;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBFullscreenPlayerViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBFullscreenPlayerViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBFullscreenPlayerViewController alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MOPUBFullscreenPlayerViewControllerDelegate delegate();

	@Generated
	@Selector("init")
	public native MOPUBFullscreenPlayerViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBFullscreenPlayerViewController initWithCoder(
			NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MOPUBFullscreenPlayerViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithVideoPlayer:dismissBlock:")
	public native MOPUBFullscreenPlayerViewController initWithVideoPlayerDismissBlock(
			MOPUBPlayerViewController playerController,
			@ObjCBlock(name = "call_initWithVideoPlayerDismissBlock") Block_initWithVideoPlayerDismissBlock dismiss);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithVideoPlayerDismissBlock {
		@Generated
		void call_initWithVideoPlayerDismissBlock(UIView arg0);
	}

	@Generated
	@Selector("playerView")
	public native MOPUBPlayerView playerView();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MOPUBFullscreenPlayerViewControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MOPUBFullscreenPlayerViewControllerDelegate value) {
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
	@Selector("setPlayerView:")
	public native void setPlayerView(MOPUBPlayerView value);
}