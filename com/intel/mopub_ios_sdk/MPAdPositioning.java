package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.VoidPtr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMutableOrderedSet;
import ios.foundation.protocol.NSCopying;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdPositioning extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdPositioning(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdPositioning alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("fixedPositions")
	public native NSMutableOrderedSet fixedPositions();

	@Generated
	@Selector("init")
	public native MPAdPositioning init();

	@Generated
	@Selector("repeatingInterval")
	@NUInt
	public native long repeatingInterval();

	@Generated
	@Selector("setRepeatingInterval:")
	public native void setRepeatingInterval(@NUInt long value);
}