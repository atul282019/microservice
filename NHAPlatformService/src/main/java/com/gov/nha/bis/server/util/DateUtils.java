/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtils
{
	private static final Log logger = LogFactory.getLog(DateUtils.class);
	public static final String DATE_FORMAT_DEFAULT = "dd/MM/yyyy hh:mm:ss";
	public static final String DATE_FORMAT_SHORT = "dd/MM/yyyy";
	public static final String TIME_FORMAT_SHORT = "HH:mm:ss";
	public static final String DATE_FORMAT_AM_PM = "dd/MM/yyyy hh:mm:ss a";
	public static final String ISO_8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_dd_MM_yyyy = "dd-MM-yyyy";
	public static final String DATE_FORMAT_24_HOUR = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYYMMDD_DATE_FORMAT = "yyyyMMdd";
	public static final String DATE_FORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String YYYYMMDD_HHmmss_DATE_FORMAT = "yyyy:MM:dd HH:mm:ss";
	public static final String DATE_FORMAT_24_HR = "dd/MM/yyyy HH:mm:ss";
	public static final String DATE_FORMAT_AM_PM_NEW = "dd-MM-yyyy hh:mm:ss a";

	public static Date convertStringToDate(String dtStr)
	{
		Date convertedDate = null;

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		try
		{
			if ((dtStr != null) && (!dtStr.trim().isEmpty()))
				convertedDate = df.parse(dtStr);
		}
		catch (ParseException e) {
			logger.debug("Date conversion failed", e);
		}
		return convertedDate;
	}

	public static Date convertStringToDateWithoutLeniency(String dtStr)
			throws ParseException
	{
		Date convertedDate = null;

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		if ((dtStr != null) && (!dtStr.trim().isEmpty())) {
			df.setLenient(false);
			convertedDate = df.parse(dtStr);
		}
		return convertedDate;
	}

	public static Date convertStringToDate(String dtStr, String dateFormat)
	{
		Date convertedDate = null;

		DateFormat df = new SimpleDateFormat(dateFormat);
		try
		{
			if ((dtStr != null) && (!dtStr.trim().isEmpty()))
			{
				convertedDate = df.parse(dtStr);
			}
		} catch (ParseException e) {
			logger.debug("Date conversion failed", e);
		}
		return convertedDate;
	}

	public static Date convertStringToDateWithoutLeniency(String dtStr, String dateFormat)
			throws ParseException
	{
		Date convertedDate = null;

		DateFormat df = new SimpleDateFormat(dateFormat);

		if ((dtStr != null) && (!dtStr.trim().isEmpty())) {
			df.setLenient(false);
			convertedDate = df.parse(dtStr);
		}
		return convertedDate;
	}

	public static String convertDateToString(Date dateToConvert)
	{
		if (dateToConvert != null) {
			return new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(dateToConvert);
		}
		return null;
	}

	public static String convertDateToString(Date dateToConvert, String dateFormat)
	{
		if (dateToConvert != null) {
			return new SimpleDateFormat(dateFormat).format(dateToConvert);
		}
		return null;
	}

	public static Date convertDateToFormat(Date dateToConvert, String dateFormat)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date convertedDate = null;
		try {
			convertedDate = sdf.parse(sdf.format(dateToConvert));
		} catch (ParseException e) {
			logger.debug("failed to convert date to format " + dateFormat);
		}
		return convertedDate;
	}

	public static Date convertDateToFormatWithoutLeniency(Date dateToConvert, String dateFormat)
			throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date convertedDate = null;
		sdf.setLenient(false);
		convertedDate = sdf.parse(sdf.format(dateToConvert));
		return convertedDate;
	}

	public static Date getCurrentTime()
	{
		return Calendar.getInstance().getTime();
	}

	public static String getCurrentTime(String dateFormat) {
		return convertDateToString(Calendar.getInstance().getTime(), dateFormat);
	}

	public static Date getDefaultDate() {
		Calendar c1 = Calendar.getInstance();
		c1.set(1900, 0, 1, 0, 0, 0);
		return c1.getTime();
	}


	public static String getSysDate(String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(new Date());	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@SuppressWarnings("deprecation")
	public static boolean isValidEnrolmentDate(Date enrlDate, Date dateOfFirstEnrolment)
	{
		if (enrlDate.getYear() < dateOfFirstEnrolment.getYear())
			return false;
		if ((enrlDate.getYear() == dateOfFirstEnrolment.getYear()) && (enrlDate.before(dateOfFirstEnrolment))) {
			return false;
		}

		return true;
	}
}