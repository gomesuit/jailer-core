package jailer.core;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class JailerAESEncryption implements JailerEncryption{
	private static final Charset charset = StandardCharsets.UTF_8;
	private static final String ENCRYPT_KEY = "1234567890123456";
	private static final String ENCRYPT_IV = "abcdefghijklmnop";

	@Override
	public byte[] encode(String str) {
		if(str == null) return null;
		
		String strResult = null;
		 
		try {
			// 文字列をバイト配列へ変換
			byte[] byteText = str.getBytes("UTF-8");
 
			// 暗号化キーと初期化ベクトルをバイト配列へ変換
			byte[] byteKey = ENCRYPT_KEY.getBytes("UTF-8");
			byte[] byteIv = ENCRYPT_IV.getBytes("UTF-8");
 
			// 暗号化キーと初期化ベクトルのオブジェクト生成
			SecretKeySpec key = new SecretKeySpec(byteKey, "AES");
			IvParameterSpec iv = new IvParameterSpec(byteIv);
 
			// Cipherオブジェクト生成
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
 
			// Cipherオブジェクトの初期化
			cipher.init(Cipher.ENCRYPT_MODE, key, iv);
 
			// 暗号化の結果格納
			byte[] byteResult = cipher.doFinal(byteText);
 
			// Base64へエンコード
			strResult = Base64.encodeBase64String(byteResult);
 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		byte[] encodedBytes = strResult.getBytes(charset);
		return encodedBytes;
	}

	@Override
	public String decoded(byte[] src) {
		if(src == null) return null;
		
		String strResult = null;
		 
		try {
			// Base64をデコード
			byte[] byteText = Base64.decodeBase64(src);
 
			// 暗号化キーと初期化ベクトルをバイト配列へ変換
			byte[] byteKey = ENCRYPT_KEY.getBytes("UTF-8");
			byte[] byteIv = ENCRYPT_IV.getBytes("UTF-8");
 
			// 復号化キーと初期化ベクトルのオブジェクト生成
			SecretKeySpec key = new SecretKeySpec(byteKey, "AES");
			IvParameterSpec iv = new IvParameterSpec(byteIv);
 
			// Cipherオブジェクト生成
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
 
			// Cipherオブジェクトの初期化
			cipher.init(Cipher.DECRYPT_MODE, key, iv);
 
			// 復号化の結果格納
			byte[] byteResult = cipher.doFinal(byteText);
 
			// バイト配列を文字列へ変換
			strResult = new String(byteResult, charset);
 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return strResult;
	}

}
