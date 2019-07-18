//
// GetProductsCharges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetProductsCharges: Codable {

    public var _id: Int?
    public var name: String?
    public var active: Bool?
    public var penalty: Bool?
    public var currency: GetChargesCurrency?
    public var amount: Int?
    public var chargeTimeType: GetChargeTimeType?
    public var chargeAppliesTo: GetChargeAppliesTo?
    public var chargeCalculationType: GetChargeCalculationType?
    public var chargePaymentMode: GetChargePaymentMode?

    public init(_id: Int?, name: String?, active: Bool?, penalty: Bool?, currency: GetChargesCurrency?, amount: Int?, chargeTimeType: GetChargeTimeType?, chargeAppliesTo: GetChargeAppliesTo?, chargeCalculationType: GetChargeCalculationType?, chargePaymentMode: GetChargePaymentMode?) {
        self._id = _id
        self.name = name
        self.active = active
        self.penalty = penalty
        self.currency = currency
        self.amount = amount
        self.chargeTimeType = chargeTimeType
        self.chargeAppliesTo = chargeAppliesTo
        self.chargeCalculationType = chargeCalculationType
        self.chargePaymentMode = chargePaymentMode
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case active
        case penalty
        case currency
        case amount
        case chargeTimeType
        case chargeAppliesTo
        case chargeCalculationType
        case chargePaymentMode
    }


}

