/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

public class InvoicePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private FraudResults fraudResults = null;

	/**
	 * Object containing the results of the fraud screening
	 */
	public FraudResults getFraudResults() {
		return fraudResults;
	}

	/**
	 * Object containing the results of the fraud screening
	 */
	public void setFraudResults(FraudResults value) {
		this.fraudResults = value;
	}
}
