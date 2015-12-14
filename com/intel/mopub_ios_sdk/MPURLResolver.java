package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSCachedURLResponse;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.foundation.NSInputStream;
import ios.foundation.NSURL;
import ios.foundation.NSURLAuthenticationChallenge;
import ios.foundation.NSURLConnection;
import ios.foundation.NSURLProtectionSpace;
import ios.foundation.NSURLRequest;
import ios.foundation.NSURLResponse;
import ios.foundation.protocol.NSURLConnectionDataDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPURLResolver extends NSObject implements
		NSURLConnectionDataDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPURLResolver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPURLResolver alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:canAuthenticateAgainstProtectionSpace:")
	public native boolean connectionCanAuthenticateAgainstProtectionSpace(
			NSURLConnection connection, NSURLProtectionSpace protectionSpace);

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:didCancelAuthenticationChallenge:")
	public native void connectionDidCancelAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:didFailWithError:")
	public native void connectionDidFailWithError(NSURLConnection connection,
			NSError error);

	@Generated
	@IsOptional
	@Deprecated
	@Selector("connection:didReceiveAuthenticationChallenge:")
	public native void connectionDidReceiveAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connection:didReceiveData:")
	public native void connectionDidReceiveData(NSURLConnection connection,
			NSData data);

	@Generated
	@IsOptional
	@Selector("connection:didReceiveResponse:")
	public native void connectionDidReceiveResponse(NSURLConnection connection,
			NSURLResponse response);

	@Generated
	@IsOptional
	@Selector("connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
	public native void connectionDidSendBodyDataTotalBytesWrittenTotalBytesExpectedToWrite(
			NSURLConnection connection, @NInt long bytesWritten,
			@NInt long totalBytesWritten, @NInt long totalBytesExpectedToWrite);

	@Generated
	@IsOptional
	@Selector("connection:needNewBodyStream:")
	public native NSInputStream connectionNeedNewBodyStream(
			NSURLConnection connection, NSURLRequest request);

	@Generated
	@IsOptional
	@Selector("connection:willCacheResponse:")
	public native NSCachedURLResponse connectionWillCacheResponse(
			NSURLConnection connection, NSCachedURLResponse cachedResponse);

	@Generated
	@IsOptional
	@Selector("connection:willSendRequest:redirectResponse:")
	public native NSURLRequest connectionWillSendRequestRedirectResponse(
			NSURLConnection connection, NSURLRequest request,
			NSURLResponse response);

	@Generated
	@IsOptional
	@Selector("connection:willSendRequestForAuthenticationChallenge:")
	public native void connectionWillSendRequestForAuthenticationChallenge(
			NSURLConnection connection, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("connectionDidFinishLoading:")
	public native void connectionDidFinishLoading(NSURLConnection connection);

	@Generated
	@IsOptional
	@Selector("connectionShouldUseCredentialStorage:")
	public native boolean connectionShouldUseCredentialStorage(
			NSURLConnection connection);

	@Generated
	@Selector("init")
	public native MPURLResolver init();

	@Generated
	@Selector("resolverWithURL:completion:")
	public static native MPURLResolver resolverWithURLCompletion(
			NSURL URL,
			@ObjCBlock(name = "call_resolverWithURLCompletion") Block_resolverWithURLCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resolverWithURLCompletion {
		@Generated
		void call_resolverWithURLCompletion(MPURLActionInfo arg0, NSError arg1);
	}

	@Generated
	@Selector("start")
	public native void start();
}