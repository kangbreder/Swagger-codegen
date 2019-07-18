//
// PostChargesRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostChargesRequest: Codable {

    public var name: String?
    public var chargeAppliesTo: Int?
    public var currencyCode: String?
    public var locale: String?
    public var amount: Float?
    public var chargeTimeType: Int?
    public var chargeCalculationType: Int?
    public var chargePaymentMode: Int?
    public var active: String?

    public init(name: String?, chargeAppliesTo: Int?, currencyCode: String?, locale: String?, amount: Float?, chargeTimeType: Int?, chargeCalculationType: Int?, chargePaymentMode: Int?, active: String?) {
        self.name = name
        self.chargeAppliesTo = chargeAppliesTo
        self.currencyCode = currencyCode
        self.locale = locale
        self.amount = amount
        self.chargeTimeType = chargeTimeType
        self.chargeCalculationType = chargeCalculationType
        self.chargePaymentMode = chargePaymentMode
        self.active = active
    }


}

