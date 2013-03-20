package org.activiti.designer.property.ui;

import org.activiti.bpmn.model.ActivitiListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;



public class TaskListenerEditor extends AbstractListenerEditor {

  public TaskListenerEditor(String key, Composite parent) {
    super(key, parent, TASK_LISTENER);
  }

  @Override
  protected AbstractListenerDialog getDialog(Shell shell, TableItem[] items) {
    return new TaskListenerDialog(shell, items);
  }

  @Override
  protected AbstractListenerDialog getDialog(Shell shell, TableItem[] items, ActivitiListener savedListener) {
    return new TaskListenerDialog(shell, items, savedListener);
  }
}
