package com.intel.mopub_ios_sdk;


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
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPImageDownloadQueue extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPImageDownloadQueue(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addDownloadImageURLs:completionBlock:")
	public native void addDownloadImageURLsCompletionBlock(
			NSArray imageURLs,
			@ObjCBlock(name = "call_addDownloadImageURLsCompletionBlock") Block_addDownloadImageURLsCompletionBlock completionBlock);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addDownloadImageURLsCompletionBlock {
		@Generated
		void call_addDownloadImageURLsCompletionBlock(NSArray arg0);
	}

	@Generated
	@Selector("addDownloadImageURLs:completionBlock:useCachedImage:")
	public native void addDownloadImageURLsCompletionBlockUseCachedImage(
			NSArray imageURLs,
			@ObjCBlock(name = "call_addDownloadImageURLsCompletionBlockUseCachedImage") Block_addDownloadImageURLsCompletionBlockUseCachedImage completionBlock,
			boolean useCachedImage);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addDownloadImageURLsCompletionBlockUseCachedImage {
		@Generated
		void call_addDownloadImageURLsCompletionBlockUseCachedImage(NSArray arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPImageDownloadQueue alloc();

	@Generated
	@Selector("cancelAllDownloads")
	public native void cancelAllDownloads();

	@Generated
	@Selector("init")
	public native MPImageDownloadQueue init();
}