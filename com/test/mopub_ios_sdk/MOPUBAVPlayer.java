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
import com.test.mopub_ios_sdk.protocol.MOPUBAVPlayerDelegate;
import ios.avfoundation.AVPlayer;
import ios.avfoundation.AVPlayerItem;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBAVPlayer extends AVPlayer {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBAVPlayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBAVPlayer alloc();

	@Generated
	@Selector("currentItemDuration")
	public native double currentItemDuration();

	@Generated
	@Selector("currentPlaybackTime")
	public native double currentPlaybackTime();

	@Generated
	@Selector("dispose")
	public native void dispose();

	@Generated
	@Selector("init")
	public native MOPUBAVPlayer init();

	@Generated
	@Selector("initWithDelegate:playerItem:")
	public native MOPUBAVPlayer initWithDelegatePlayerItem(
			@Mapped(ObjCObjectMapper.class) MOPUBAVPlayerDelegate delegate,
			AVPlayerItem playerItem);

	@Generated
	@Selector("initWithPlayerItem:")
	public native MOPUBAVPlayer initWithPlayerItem(AVPlayerItem item);

	@Generated
	@Selector("initWithURL:")
	public native MOPUBAVPlayer initWithURL(NSURL URL);

	@Generated
	@Selector("playerWithPlayerItem:")
	public static native MOPUBAVPlayer playerWithPlayerItem(AVPlayerItem item);

	@Generated
	@Selector("playerWithURL:")
	public static native MOPUBAVPlayer playerWithURL(NSURL URL);
}