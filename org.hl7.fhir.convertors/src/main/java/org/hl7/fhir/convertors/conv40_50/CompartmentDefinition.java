package org.hl7.fhir.convertors.conv40_50;

import org.hl7.fhir.exceptions.FHIRException;

import org.hl7.fhir.convertors.VersionConvertor_40_50;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0


public class CompartmentDefinition extends VersionConvertor_40_50 {

  public static org.hl7.fhir.r5.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.r4.model.CompartmentDefinition src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.CompartmentDefinition tgt = new org.hl7.fhir.r5.model.CompartmentDefinition();
    copyDomainResource(src, tgt);
    if (src.hasUrl())
      tgt.setUrlElement(convertUri(src.getUrlElement()));
    if (src.hasVersion())
      tgt.setVersionElement(convertString(src.getVersionElement()));
    if (src.hasName())
      tgt.setNameElement(convertString(src.getNameElement()));
    if (src.hasStatus())
      tgt.setStatus(Enumerations.convertPublicationStatus(src.getStatus()));
    if (src.hasExperimental())
      tgt.setExperimentalElement(convertBoolean(src.getExperimentalElement()));
    if (src.hasDate())
      tgt.setDateElement(convertDateTime(src.getDateElement()));
    if (src.hasPublisher())
      tgt.setPublisherElement(convertString(src.getPublisherElement()));
    for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact())
      tgt.addContact(convertContactDetail(t));
    if (src.hasDescription())
      tgt.setDescriptionElement(convertMarkdown(src.getDescriptionElement()));
    for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext())
      tgt.addUseContext(convertUsageContext(t));
    if (src.hasPurpose())
      tgt.setPurposeElement(convertMarkdown(src.getPurposeElement()));
    if (src.hasCode())
      tgt.setCode(convertCompartmentType(src.getCode()));
    if (src.hasSearch())
      tgt.setSearchElement(convertBoolean(src.getSearchElement()));
    for (org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource())
      tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.r5.model.CompartmentDefinition src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.CompartmentDefinition tgt = new org.hl7.fhir.r4.model.CompartmentDefinition();
    copyDomainResource(src, tgt);
    if (src.hasUrl())
      tgt.setUrlElement(convertUri(src.getUrlElement()));
    if (src.hasVersion())
      tgt.setVersionElement(convertString(src.getVersionElement()));
    if (src.hasName())
      tgt.setNameElement(convertString(src.getNameElement()));
    if (src.hasStatus())
      tgt.setStatus(Enumerations.convertPublicationStatus(src.getStatus()));
    if (src.hasExperimental())
      tgt.setExperimentalElement(convertBoolean(src.getExperimentalElement()));
    if (src.hasDate())
      tgt.setDateElement(convertDateTime(src.getDateElement()));
    if (src.hasPublisher())
      tgt.setPublisherElement(convertString(src.getPublisherElement()));
    for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact())
      tgt.addContact(convertContactDetail(t));
    if (src.hasDescription())
      tgt.setDescriptionElement(convertMarkdown(src.getDescriptionElement()));
    for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext())
      tgt.addUseContext(convertUsageContext(t));
    if (src.hasPurpose())
      tgt.setPurposeElement(convertMarkdown(src.getPurposeElement()));
    if (src.hasCode())
      tgt.setCode(convertCompartmentType(src.getCode()));
    if (src.hasSearch())
      tgt.setSearchElement(convertBoolean(src.getSearchElement()));
    for (org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource())
      tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PATIENT: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.PATIENT;
    case ENCOUNTER: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
    case RELATEDPERSON: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
    case PRACTITIONER: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.DEVICE;
    default: return org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType.NULL;
  }
}

  public static org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PATIENT: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PATIENT;
    case ENCOUNTER: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
    case RELATEDPERSON: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
    case PRACTITIONER: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
    case DEVICE: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.DEVICE;
    default: return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.NULL;
  }
}

  public static org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
    copyElement(src, tgt);
    if (src.hasCode())
      tgt.setCodeElement(convertCode(src.getCodeElement()));
    for (org.hl7.fhir.r4.model.StringType t : src.getParam())
      tgt.getParam().add(convertString(t));
    if (src.hasDocumentation())
      tgt.setDocumentationElement(convertString(src.getDocumentationElement()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
    copyElement(src, tgt);
    if (src.hasCode())
      tgt.setCodeElement(convertCode(src.getCodeElement()));
    for (org.hl7.fhir.r5.model.StringType t : src.getParam())
      tgt.getParam().add(convertString(t));
    if (src.hasDocumentation())
      tgt.setDocumentationElement(convertString(src.getDocumentationElement()));
    return tgt;
  }


}
