package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPNativeAdSourceQueueDelegate;
import ios.NSObject;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdSourceQueue extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdSourceQueue(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdSourceQueue alloc();

	@Generated
	@Selector("cancelRequests")
	public native void cancelRequests();

	@Generated
	@Selector("count")
	@NUInt
	public native long count();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdSourceQueueDelegate delegate();

	@Generated
	@Selector("dequeueAdWithMaxAge:")
	public native MPNativeAd dequeueAdWithMaxAge(double age);

	@Generated
	@Selector("init")
	public native MPNativeAdSourceQueue init();

	@Generated
	@Selector("initWithAdUnitIdentifier:rendererConfigurations:andTargeting:")
	public native MPNativeAdSourceQueue initWithAdUnitIdentifierRendererConfigurationsAndTargeting(
			String identifier, NSArray rendererConfigurations,
			MPNativeAdRequestTargeting targeting);

	@Generated
	@Selector("loadAds")
	public native void loadAds();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeAdSourceQueueDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdSourceQueueDelegate value) {
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