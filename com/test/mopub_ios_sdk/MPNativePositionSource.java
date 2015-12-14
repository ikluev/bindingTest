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
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativePositionSource extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativePositionSource(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativePositionSource alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("init")
	public native MPNativePositionSource init();

	@Generated
	@Selector("loadPositionsWithAdUnitIdentifier:completionHandler:")
	public native void loadPositionsWithAdUnitIdentifierCompletionHandler(
			String identifier,
			@ObjCBlock(name = "call_loadPositionsWithAdUnitIdentifierCompletionHandler") Block_loadPositionsWithAdUnitIdentifierCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadPositionsWithAdUnitIdentifierCompletionHandler {
		@Generated
		void call_loadPositionsWithAdUnitIdentifierCompletionHandler(
				MPAdPositioning arg0, NSError arg1);
	}
}