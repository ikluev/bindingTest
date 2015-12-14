package com.intel.mopub_ios_sdk;


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
import com.intel.mopub_ios_sdk.protocol.MRCommandDelegate;
import ios.NSObject;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRCommand extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MRCommand(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRCommand alloc();

	@Generated
	@Selector("commandForString:")
	public static native MRCommand commandForString(String string);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MRCommandDelegate delegate();

	@Generated
	@Selector("executableWhileBlockingRequests")
	public native boolean executableWhileBlockingRequests();

	@Generated
	@Selector("executeWithParams:")
	public native boolean executeWithParams(NSDictionary params);

	@Generated
	@Selector("init")
	public native MRCommand init();

	@Generated
	@Selector("requiresUserInteractionForPlacementType:")
	public native boolean requiresUserInteractionForPlacementType(
			@NUInt long placementType);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MRCommandDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MRCommandDelegate value) {
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