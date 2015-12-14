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
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdRendererImageHandlerDelegate;
import ios.NSObject;
import ios.foundation.NSURL;
import ios.uikit.UIImageView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdRendererImageHandler extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdRendererImageHandler(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdRendererImageHandler alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdRendererImageHandlerDelegate delegate();

	@Generated
	@Selector("init")
	public native MPNativeAdRendererImageHandler init();

	@Generated
	@Selector("loadImageForURL:intoImageView:")
	public native void loadImageForURLIntoImageView(NSURL imageURL,
			UIImageView imageView);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRendererImageHandlerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRendererImageHandlerDelegate value) {
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
}