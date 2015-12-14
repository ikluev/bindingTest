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
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPObjectMapper;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStringToNumberMapper extends NSObject implements MPObjectMapper {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStringToNumberMapper(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStringToNumberMapper alloc();

	@Generated
	@Selector("init")
	public native MPStringToNumberMapper init();

	@Generated
	@Selector("initWithNumberStyle:")
	public native MPStringToNumberMapper initWithNumberStyle(
			@NUInt long numberStyle);

	@Generated
	@Selector("mappedObjectFromSourceObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mappedObjectFromSourceObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("requiredSourceObjectClass")
	public native Class requiredSourceObjectClass();
}