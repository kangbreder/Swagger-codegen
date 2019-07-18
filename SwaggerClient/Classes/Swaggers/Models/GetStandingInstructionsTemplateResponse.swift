//
// GetStandingInstructionsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetStandingInstructionsTemplateResponse: Codable {

    public var fromOffice: GetFromOfficeResponseStandingInstructionSwagger?
    public var fromAccountType: GetFromAccountTypeResponseStandingInstructionSwagger?
    public var fromOfficeOptions: [GetFromOfficeOptionsResponseStandingInstructionSwagger]?
    public var fromClientOptions: [GetFromClientOptionsResponseStandingInstructionSwagger]?
    public var fromAccountTypeOptions: [GetFromAccountTypeOptionsResponseStandingInstructionSwagger]?
    public var toOfficeOptions: [GetToOfficeOptionsResponseStandingInstructionSwagger]?
    public var toAccountTypeOptions: [GetToAccountTypeOptionsResponseStandingInstructionSwagger]?
    public var transferTypeOptions: [GetTransferTypeOptionsResponseStandingInstructionSwagger]?
    public var statusOptions: [GetStatusOptionsResponseStandingInstructionSwagger]?
    public var instructionTypeOptions: [GetInstructionTypeOptionsResponseStandingInstructionSwagger]?
    public var priorityOptions: [GetPriorityOptionsResponseStandingInstructionSwagger]?
    public var recurrenceTypeOptions: [GetRecurrenceTypeOptionsResponseStandingInstructionSwagger]?
    public var recurrenceFrequencyOptions: [GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger]?

    public init(fromOffice: GetFromOfficeResponseStandingInstructionSwagger?, fromAccountType: GetFromAccountTypeResponseStandingInstructionSwagger?, fromOfficeOptions: [GetFromOfficeOptionsResponseStandingInstructionSwagger]?, fromClientOptions: [GetFromClientOptionsResponseStandingInstructionSwagger]?, fromAccountTypeOptions: [GetFromAccountTypeOptionsResponseStandingInstructionSwagger]?, toOfficeOptions: [GetToOfficeOptionsResponseStandingInstructionSwagger]?, toAccountTypeOptions: [GetToAccountTypeOptionsResponseStandingInstructionSwagger]?, transferTypeOptions: [GetTransferTypeOptionsResponseStandingInstructionSwagger]?, statusOptions: [GetStatusOptionsResponseStandingInstructionSwagger]?, instructionTypeOptions: [GetInstructionTypeOptionsResponseStandingInstructionSwagger]?, priorityOptions: [GetPriorityOptionsResponseStandingInstructionSwagger]?, recurrenceTypeOptions: [GetRecurrenceTypeOptionsResponseStandingInstructionSwagger]?, recurrenceFrequencyOptions: [GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger]?) {
        self.fromOffice = fromOffice
        self.fromAccountType = fromAccountType
        self.fromOfficeOptions = fromOfficeOptions
        self.fromClientOptions = fromClientOptions
        self.fromAccountTypeOptions = fromAccountTypeOptions
        self.toOfficeOptions = toOfficeOptions
        self.toAccountTypeOptions = toAccountTypeOptions
        self.transferTypeOptions = transferTypeOptions
        self.statusOptions = statusOptions
        self.instructionTypeOptions = instructionTypeOptions
        self.priorityOptions = priorityOptions
        self.recurrenceTypeOptions = recurrenceTypeOptions
        self.recurrenceFrequencyOptions = recurrenceFrequencyOptions
    }


}

