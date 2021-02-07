// @ts-nocheck
import React from 'react';
import { ApplyPluginsType } from '/Users/Tommy/Desktop/studyInMassey/Java_study/react/react05/node_modules/@umijs/runtime';
import * as umiExports from './umiExports';
import { plugin } from './plugin';

export function getRoutes() {
  const routes = [
  {
    "path": "/HelloWorld",
    "exact": true,
    "component": require('@/pages/HelloWorld.jsx').default
  }
];

  // allow user to extend routes
  plugin.applyPlugins({
    key: 'patchRoutes',
    type: ApplyPluginsType.event,
    args: { routes },
  });

  return routes;
}
