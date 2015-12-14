package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdRendererSettings;
import ios.NSObject;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdRendererConfiguration extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdRendererConfiguration(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdRendererConfiguration alloc();

	@Generated
	@Selector("init")
	public native MPNativeAdRendererConfiguration init();

	@Generated
	@Selector("rendererClass")
	public native Class rendererClass();

	@Generated
	@Selector("rendererSettings")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdRendererSettings rendererSettings();

	@Generated
	@Selector("setRendererClass:")
	public native void setRendererClass(Class value);

	@Generated
	@Selector("setRendererSettings:")
	public native void setRendererSettings(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRendererSettings value);

	@Generated
	@Selector("setSupportedCustomEvents:")
	public native void setSupportedCustomEvents(NSArray value);

	@Generated
	@Selector("supportedCustomEvents")
	public native NSArray supportedCustomEvents();
}