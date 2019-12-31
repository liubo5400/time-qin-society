package com.lbo.code.timeqinsociety.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;


public final class StringUtil {
	private static Log logger = LogFactory.getLog(StringUtil.class);

	private static final ThreadLocal<MessageDigest> DIGESTER_CONTEXT = new ThreadLocal<MessageDigest>() {
		protected synchronized MessageDigest initialValue() {
			try {
				return MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			}
		}
	};

	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };


	/**
	 * 通过文件二进制数据计算md5值
	 * @param fileData 文件二进制数据
	 * @return md5
	 */
	public static String getMd5(byte[] fileData) {
		MessageDigest digester = DIGESTER_CONTEXT.get();
		digester.update(fileData);
		byte[] md5Bytes = digester.digest();

		int length = md5Bytes.length;
		char[] md5String = new char[length * 2];
		int k = 0;
		for (int i = 0; i < length; i++) {
			byte b = md5Bytes[i];
			md5String[k++] = HEX_DIGITS[b >>> 4 & 0xf];
			md5String[k++] = HEX_DIGITS[b & 0xf];
		}
		return new String(md5String);
	}

	/**
	 * 把电话号码中间四位用****代替
	 * @return
	 */
	public static String hideTelephone(String telephone) {
		if (StringUtils.isBlank(telephone)) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		if (telephone.length() > 2)
			sb.append(telephone.substring(0, 3));
		sb.append("****");
		if (telephone.length() > 10)
			sb.append(telephone.substring(7, 11));
		return sb.toString();
	}

	/**
	 * 随机字符串
	 * @param length  表示生成字符串的长度
	 * @return
	 */
	public static String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789-ABCDEFGHIGKLMNOPQRSTUVWXVZ";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
}
