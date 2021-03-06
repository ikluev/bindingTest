package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTResource extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTResource(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTResource alloc();

	@Generated
	@Selector("content")
	public native String content();

	@Generated
	@Selector("init")
	public native MPVASTResource init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTResource initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("staticCreativeType")
	public native String staticCreativeType();
}