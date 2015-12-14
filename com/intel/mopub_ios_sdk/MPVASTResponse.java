package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTResponse extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTResponse(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("ads")
	public native NSArray ads();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTResponse alloc();

	@Generated
	@Selector("errorURLs")
	public native NSArray errorURLs();

	@Generated
	@Selector("init")
	public native MPVASTResponse init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTResponse initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("version")
	public native String version();
}