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
import ios.foundation.NSURL;
import ios.uikit.UIImageView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdRenderingImageLoader extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdRenderingImageLoader(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdRenderingImageLoader alloc();

	@Generated
	@Selector("init")
	public native MPNativeAdRenderingImageLoader init();

	@Generated
	@Selector("initWithImageHandler:")
	public native MPNativeAdRenderingImageLoader initWithImageHandler(
			MPNativeAdRendererImageHandler imageHandler);

	@Generated
	@Selector("loadImageForURL:intoImageView:")
	public native void loadImageForURLIntoImageView(NSURL url,
			UIImageView imageView);
}