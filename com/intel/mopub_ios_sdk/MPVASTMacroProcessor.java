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
import ios.NSObject;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTMacroProcessor extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTMacroProcessor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTMacroProcessor alloc();

	@Generated
	@Selector("init")
	public native MPVASTMacroProcessor init();

	@Generated
	@Selector("macroExpandedURLForURL:errorCode:")
	public static native NSURL macroExpandedURLForURLErrorCode(NSURL URL,
			String errorCode);

	@Generated
	@Selector("macroExpandedURLForURL:errorCode:videoTimeOffset:videoAssetURL:")
	public static native NSURL macroExpandedURLForURLErrorCodeVideoTimeOffsetVideoAssetURL(
			NSURL URL, String errorCode, double timeOffset, NSURL videoAssetURL);
}