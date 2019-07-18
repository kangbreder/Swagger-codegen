//
// ChargeData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ChargeData: Codable {

    public var _id: Int64?
    public var name: String?
    public var penalty: Bool?
    public var currency: CurrencyData?
    public var overdueInstallmentCharge: Bool?

    public init(_id: Int64?, name: String?, penalty: Bool?, currency: CurrencyData?, overdueInstallmentCharge: Bool?) {
        self._id = _id
        self.name = name
        self.penalty = penalty
        self.currency = currency
        self.overdueInstallmentCharge = overdueInstallmentCharge
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case penalty
        case currency
        case overdueInstallmentCharge
    }


}

