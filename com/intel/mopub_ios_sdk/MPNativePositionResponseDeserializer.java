package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSData;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativePositionResponseDeserializer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativePositionResponseDeserializer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativePositionResponseDeserializer alloc();

	@Generated
	@Selector("clientPositioningForData:error:")
	public native MPClientAdPositioning clientPositioningForDataError(
			NSData data, Ptr<NSError> error);

	@Generated
	@Selector("deserializer")
	public static native MPNativePositionResponseDeserializer deserializer();

	@Generated
	@Selector("init")
	public native MPNativePositionResponseDeserializer init();
}