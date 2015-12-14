package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTManager alloc();

	@Generated
	@Selector("fetchVASTWithData:completion:")
	public static native void fetchVASTWithDataCompletion(
			NSData data,
			@ObjCBlock(name = "call_fetchVASTWithDataCompletion") Block_fetchVASTWithDataCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchVASTWithDataCompletion {
		@Generated
		void call_fetchVASTWithDataCompletion(MPVASTResponse arg0, NSError arg1);
	}

	@Generated
	@Selector("fetchVASTWithURL:completion:")
	public static native void fetchVASTWithURLCompletion(
			NSURL URL,
			@ObjCBlock(name = "call_fetchVASTWithURLCompletion") Block_fetchVASTWithURLCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchVASTWithURLCompletion {
		@Generated
		void call_fetchVASTWithURLCompletion(MPVASTResponse arg0, NSError arg1);
	}

	@Generated
	@Selector("init")
	public native MPVASTManager init();
}