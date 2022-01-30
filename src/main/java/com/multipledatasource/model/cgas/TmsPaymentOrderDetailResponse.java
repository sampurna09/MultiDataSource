package com.multipledatasource.model.cgas;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "AC_TMS_PAYMENTORDERDTL_RESPONSE")
public class TmsPaymentOrderDetailResponse {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PAYMENTORDER_ID")
    private Long paymentOrderId;

    @Column(name = "PAYEE_ID")
    private Long payeeId;

    @Column(name = "Payee_Code")
    private String payeeCode;

    @Column(name = "PAYEE_NAME")
    private String payeeeName;

    @Column(name = "Bank_CODE")
    private String bankCode;

    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    @Column(name = "TRANSACTION_NO")
    private String transactionNo;

    @Column(name = "CHEQUE_NO")
    private String chequeNo;

    @Column(name = "AMOUNT")
    private Double  Amount;

    @Column(name = "PAYMENTGATEWAY_ID")
    private Long paymentGatewayId;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "UPDATED_ON")
    private Date updatedOn;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "MESSAGE")
    private String message;


    public TmsPaymentOrderDetailResponse()
    {

    }
}

