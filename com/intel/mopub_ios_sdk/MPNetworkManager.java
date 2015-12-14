package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSOperation;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNetworkManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNetworkManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addNetworkTransferOperation:")
	public native void addNetworkTransferOperation(NSOperation operation);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNetworkManager alloc();

	@Generated
	@Selector("cancelOperation:")
	public native void cancelOperation(NSOperation operation);

	@Generated
	@Selector("init")
	public native MPNetworkManager init();

	@Generated
	@Selector("networkTransferOperationCount")
	@NUInt
	public native long networkTransferOperationCount();

	@Generated
	@Selector("sharedNetworkManager")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedNetworkManager();
}