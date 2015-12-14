package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSData;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeCache extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeCache(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeCache alloc();

	@Generated
	@Selector("cachedDataExistsForKey:")
	public native boolean cachedDataExistsForKey(String key);

	@Generated
	@Selector("init")
	public native MPNativeCache init();

	@Generated
	@Selector("removeAllDataFromCache")
	public native void removeAllDataFromCache();

	@Generated
	@Selector("retrieveDataForKey:")
	public native NSData retrieveDataForKey(String key);

	@Generated
	@Selector("setInMemoryCacheEnabled:")
	public native void setInMemoryCacheEnabled(boolean enabled);

	@Generated
	@Selector("sharedCache")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedCache();

	@Generated
	@Selector("storeData:forKey:")
	public native void storeDataForKey(NSData data, String key);
}