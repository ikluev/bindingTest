package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
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
public class MPURLActionInfo extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPURLActionInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTTPResponseString")
	public native String HTTPResponseString();

	@Generated
	@Selector("actionType")
	@NUInt
	public native long actionType();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPURLActionInfo alloc();

	@Generated
	@Selector("deeplinkURL")
	public native NSURL deeplinkURL();

	@Generated
	@Selector("enhancedDeeplinkRequest")
	public native MPEnhancedDeeplinkRequest enhancedDeeplinkRequest();

	@Generated
	@Selector("iTunesItemIdentifier")
	public native String iTunesItemIdentifier();

	@Generated
	@Selector("iTunesStoreFallbackURL")
	public native NSURL iTunesStoreFallbackURL();

	@Generated
	@Selector("infoWithURL:HTTPResponseString:webViewBaseURL:")
	public static native MPURLActionInfo infoWithURLHTTPResponseStringWebViewBaseURL(
			NSURL URL, String responseString, NSURL baseURL);

	@Generated
	@Selector("infoWithURL:deeplinkURL:")
	public static native MPURLActionInfo infoWithURLDeeplinkURL(NSURL URL,
			NSURL deeplinkURL);

	@Generated
	@Selector("infoWithURL:enhancedDeeplinkRequest:")
	public static native MPURLActionInfo infoWithURLEnhancedDeeplinkRequest(
			NSURL URL, MPEnhancedDeeplinkRequest request);

	@Generated
	@Selector("infoWithURL:iTunesItemIdentifier:iTunesStoreFallbackURL:")
	public static native MPURLActionInfo infoWithURLITunesItemIdentifierITunesStoreFallbackURL(
			NSURL URL, String identifier, NSURL URL_);

	@Generated
	@Selector("infoWithURL:safariDestinationURL:")
	public static native MPURLActionInfo infoWithURLSafariDestinationURL(
			NSURL URL, NSURL safariDestinationURL);

	@Generated
	@Selector("infoWithURL:shareURL:")
	public static native MPURLActionInfo infoWithURLShareURL(NSURL URL,
			NSURL shareURL);

	@Generated
	@Selector("init")
	public native MPURLActionInfo init();

	@Generated
	@Selector("originalURL")
	public native NSURL originalURL();

	@Generated
	@Selector("safariDestinationURL")
	public native NSURL safariDestinationURL();

	@Generated
	@Selector("shareURL")
	public native NSURL shareURL();

	@Generated
	@Selector("webViewBaseURL")
	public native NSURL webViewBaseURL();
}