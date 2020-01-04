package com.jeecg.p3.qrcode.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>二维码表<br>
 * @author sunkai
 * @since：2018年08月30日 10时29分25秒 星期四 
 * @version:1.0
 */
public class WeixinQrcode implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
QR_LIMIT_STR_SCENE：永久字符串
	
	private Integer scanCount;
	
	public Integer getScanCount() {
		return scanCount;
	}
	public void setScanCount(Integer scanCount) {
		this.scanCount = scanCount;
	}
}
