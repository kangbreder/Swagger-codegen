//
// GetLoansLoanIdCollateralsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoansLoanIdCollateralsResponse: Codable {

    public var _id: Int?
    public var type: GetCollateralTypeResponse?
    public var value: Int64?
    public var _description: String?
    public var currency: GetCollateralCurrencyResponse?

    public init(_id: Int?, type: GetCollateralTypeResponse?, value: Int64?, _description: String?, currency: GetCollateralCurrencyResponse?) {
        self._id = _id
        self.type = type
        self.value = value
        self._description = _description
        self.currency = currency
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case type
        case value
        case _description = "description"
        case currency
    }


}

