//
// GetLoansTotal.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoansTotal: Codable {

    public var currencyCode: String?
    public var digitsAfterDecimal: Int?
    public var inMultiplesOf: Int?
    public var amount: Float?
    public var defaultName: String?
    public var nameCode: String?
    public var displaySymbol: String?
    public var zero: Bool?
    public var greaterThanZero: Bool?
    public var displaySymbolValue: String?

    public init(currencyCode: String?, digitsAfterDecimal: Int?, inMultiplesOf: Int?, amount: Float?, defaultName: String?, nameCode: String?, displaySymbol: String?, zero: Bool?, greaterThanZero: Bool?, displaySymbolValue: String?) {
        self.currencyCode = currencyCode
        self.digitsAfterDecimal = digitsAfterDecimal
        self.inMultiplesOf = inMultiplesOf
        self.amount = amount
        self.defaultName = defaultName
        self.nameCode = nameCode
        self.displaySymbol = displaySymbol
        self.zero = zero
        self.greaterThanZero = greaterThanZero
        self.displaySymbolValue = displaySymbolValue
    }


}
