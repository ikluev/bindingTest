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
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MRImageDownloaderDelegate;
import ios.NSObject;
import ios.foundation.NSMutableDictionary;
import ios.foundation.NSOperationQueue;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRImageDownloader extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MRImageDownloader(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRImageDownloader alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MRImageDownloaderDelegate delegate();

	@Generated
	@Selector("downloadImageWithURL:")
	public native void downloadImageWithURL(NSURL URL);

	@Generated
	@Selector("init")
	public native MRImageDownloader init();

	@Generated
	@Selector("initWithDelegate:")
	public native MRImageDownloader initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRImageDownloaderDelegate delegate);

	@Generated
	@Selector("pendingOperations")
	public native NSMutableDictionary pendingOperations();

	@Generated
	@Selector("queue")
	public native NSOperationQueue queue();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MRImageDownloaderDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MRImageDownloaderDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("setPendingOperations:")
	public native void setPendingOperations(NSMutableDictionary value);

	@Generated
	@Selector("setQueue:")
	public native void setQueue(NSOperationQueue value);
}