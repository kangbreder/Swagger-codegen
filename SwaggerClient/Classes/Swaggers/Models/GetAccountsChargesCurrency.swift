//
// GetAccountsChargesCurrency.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountsChargesCurrency: Codable {

    public var code: String?
    public var name: String?
    public var decimalPlaces: Int?
    public var displaySymbol: String?
    public var nameCode: String?
    public var displayLabel: String?

    public init(code: String?, name: String?, decimalPlaces: Int?, displaySymbol: String?, nameCode: String?, displayLabel: String?) {
        self.code = code
        self.name = name
        self.decimalPlaces = decimalPlaces
        self.displaySymbol = displaySymbol
        self.nameCode = nameCode
        self.displayLabel = displayLabel
    }


}

