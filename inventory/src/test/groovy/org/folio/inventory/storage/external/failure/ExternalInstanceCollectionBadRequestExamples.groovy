package org.folio.inventory.storage.external.failure

import org.folio.inventory.storage.external.ExternalStorageCollections
import org.folio.metadata.common.domain.Failure

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class ExternalInstanceCollectionBadRequestExamples
  extends ExternalInstanceCollectionFailureExamples {

  ExternalInstanceCollectionBadRequestExamples() {
    super(ExternalStorageFailureSuite.useVertx(
      { new ExternalStorageCollections(it,
        ExternalStorageFailureSuite.badRequestStorageAddress)}))
  }

  @Override
  protected check(Failure failure) {
    assertThat(failure.reason, is("Bad Request"))
  }
}
