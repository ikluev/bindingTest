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
import ios.NSObject;
import ios.foundation.NSData;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPDiskLRUCache extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPDiskLRUCache(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPDiskLRUCache alloc();

	@Generated
	@Selector("cachedDataExistsForKey:")
	public native boolean cachedDataExistsForKey(String key);

	@Generated
	@Selector("init")
	public native MPDiskLRUCache init();

	@Generated
	@Selector("removeAllCachedFiles")
	public native void removeAllCachedFiles();

	@Generated
	@Selector("retrieveDataForKey:")
	public native NSData retrieveDataForKey(String key);

	@Generated
	@Selector("sharedDiskCache")
	public static native MPDiskLRUCache sharedDiskCache();

	@Generated
	@Selector("storeData:forKey:")
	public native void storeDataForKey(NSData data, String key);
}