package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.avfoundation.AVPlayer;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBAVPlayerView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBAVPlayerView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBAVPlayerView alloc();

	@Generated
	@Selector("init")
	public native MOPUBAVPlayerView init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBAVPlayerView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MOPUBAVPlayerView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("player")
	public native AVPlayer player();

	@Generated
	@Selector("setPlayer:")
	public native void setPlayer(AVPlayer value);

	@Generated
	@Selector("setVideoGravity:")
	public native void setVideoGravity(String value);

	@Generated
	@Selector("videoGravity")
	public native String videoGravity();
}