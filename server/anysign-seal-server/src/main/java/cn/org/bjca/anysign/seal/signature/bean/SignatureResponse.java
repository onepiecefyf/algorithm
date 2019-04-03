package cn.org.bjca.anysign.seal.signature.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zjgao
 * @create 2018/9/13.
 * @description
 */
@Data
public class SignatureResponse implements Serializable {
    private String transId = null;
    private String fileId = null;
    private String fileContent = null;
    private String signValue = null;
}
