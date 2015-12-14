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
import com.intel.mopub_ios_sdk.protocol.MPNativeAdSourceDelegate;
import ios.NSObject;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdSource extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdSource(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdSource alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdSourceDelegate delegate();

	@Generated
	@Selector("deleteCacheForAdUnitIdentifier:")
	public native void deleteCacheForAdUnitIdentifier(String identifier);

	@Generated
	@Selector("dequeueAdForAdUnitIdentifier:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dequeueAdForAdUnitIdentifier(String identifier);

	@Generated
	@Selector("init")
	public native MPNativeAdSource init();

	@Generated
	@Selector("loadAdsWithAdUnitIdentifier:rendererConfigurations:andTargeting:")
	public native void loadAdsWithAdUnitIdentifierRendererConfigurationsAndTargeting(
			String identifier, NSArray rendererConfigurations,
			MPNativeAdRequestTargeting targeting);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeAdSourceDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdSourceDelegate value) {
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
	@Selector("source")
	public static native MPNativeAdSource source();
}