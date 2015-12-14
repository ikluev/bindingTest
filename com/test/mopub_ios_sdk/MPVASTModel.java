package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTModel extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTModel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTModel alloc();

	@Generated
	@Selector("generateModelFromDictionaryValue:modelProvider:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object generateModelFromDictionaryValueModelProvider(
			@Mapped(ObjCObjectMapper.class) Object value,
			@ObjCBlock(name = "call_generateModelFromDictionaryValueModelProvider") Block_generateModelFromDictionaryValueModelProvider provider);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_generateModelFromDictionaryValueModelProvider {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_generateModelFromDictionaryValueModelProvider(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@Selector("generateModelsFromDictionaryValue:modelProvider:")
	public native NSArray generateModelsFromDictionaryValueModelProvider(
			@Mapped(ObjCObjectMapper.class) Object value,
			@ObjCBlock(name = "call_generateModelsFromDictionaryValueModelProvider") Block_generateModelsFromDictionaryValueModelProvider provider);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_generateModelsFromDictionaryValueModelProvider {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_generateModelsFromDictionaryValueModelProvider(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@Selector("init")
	public native MPVASTModel init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTModel initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();
}